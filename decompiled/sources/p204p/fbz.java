package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fbz {

    /* JADX INFO: renamed from: a */
    public final String f67959a;

    public fbz(String str) {
        this.f67959a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbz) && wj50.m88271j(this.f67959a, ((fbz) obj).f67959a);
    }

    public final int hashCode() {
        String str = this.f67959a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("FirebaseSessionsData(sessionId="), this.f67959a, ')');
    }
}
