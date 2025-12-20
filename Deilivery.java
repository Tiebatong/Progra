class Delivery {

    private Sendable[] sendable;

    Delivery(Sendable[] sendable) {
        java.util.Objects.requireNonNull(sendable);
        for(Sendable s: sendable) {
            java.util.Objects.requireNonNull(s);
        }
        this.sendable = sendable.clone();
    }

    Delivery(Sendable sendable) {
        java.util.Objects.requireNonNull(sendable);
        this.sendable = new Sendable[] {sendable};
    }

    private static int postage(Sendable sendable) {
        int postage = 0;

        if(sendable.senderLocation().equals(sendable.receiverLocation()) != true) {
            postage += 1;
        }

        if (sendable.weight() < 100) {
            postage += 1;
        } else if (sendable.weight() >= 100) {
            postage += 2;
        }

        return postage;
    }

    int postage() {
        int postage = 0;

        for(Sendable s: sendable) {
            postage += postage(s);
        }

        return postage;
    }

    
    
}
