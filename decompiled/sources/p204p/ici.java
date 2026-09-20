package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ici implements jci {

    /* JADX INFO: renamed from: a */
    public final String f100823a;

    public ici(String str) {
        this.f100823a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ici) && wj50.m88271j(this.f100823a, ((ici) obj).f100823a);
    }

    public final int hashCode() {
        return this.f100823a.hashCode();
    }
}
