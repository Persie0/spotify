package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hyu0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hyu0);
    }

    public final int hashCode() {
        return -907686561;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("mobile_client/authentication".length() + 24);
        sb.append("RecaptchaAction(action=mobile_client/authentication)");
        return sb.toString();
    }
}
