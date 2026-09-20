package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bmy implements hmy {

    /* JADX INFO: renamed from: a */
    public final toy f28650a;

    public bmy(toy toyVar) {
        this.f28650a = toyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmy) && wj50.m88271j(this.f28650a, ((bmy) obj).f28650a);
    }

    public final int hashCode() {
        return this.f28650a.hashCode();
    }
}
