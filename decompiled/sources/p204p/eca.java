package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eca {

    /* JADX INFO: renamed from: a */
    public final fca f58276a;

    /* JADX INFO: renamed from: b */
    public final fca f58277b;

    /* JADX INFO: renamed from: c */
    public final fca f58278c;

    public eca(fca fcaVar, fca fcaVar2, fca fcaVar3) {
        this.f58276a = fcaVar;
        this.f58277b = fcaVar2;
        this.f58278c = fcaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eca)) {
            return false;
        }
        eca ecaVar = (eca) obj;
        return this.f58276a.equals(ecaVar.f58276a) && this.f58277b.equals(ecaVar.f58277b) && this.f58278c.equals(ecaVar.f58278c);
    }

    public final int hashCode() {
        return this.f58278c.hashCode() + ((this.f58277b.hashCode() + (this.f58276a.hashCode() * 31)) * 31);
    }
}
