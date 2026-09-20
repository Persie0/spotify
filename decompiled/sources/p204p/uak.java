package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class uak extends wak {

    /* JADX INFO: renamed from: a */
    public final rr60 f228511a;

    public uak(rr60 rr60Var) {
        this.f228511a = rr60Var;
    }

    @Override // p204p.wak
    /* JADX INFO: renamed from: a */
    public final rr60 mo82697a(List list) {
        return this.f228511a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uak) && wj50.m88271j(((uak) obj).f228511a, this.f228511a);
    }

    public final int hashCode() {
        return this.f228511a.hashCode();
    }
}
