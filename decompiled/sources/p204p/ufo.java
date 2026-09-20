package p204p;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class ufo implements ny8 {
    public static final tfo Companion = new tfo();

    /* JADX INFO: renamed from: a */
    public final boolean f229849a;

    /* JADX INFO: renamed from: b */
    public final String f229850b;

    public /* synthetic */ ufo(String str, int i, boolean z) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, sfo.f208621a.getDescriptor());
            throw null;
        }
        this.f229849a = z;
        if ((i & 2) == 0) {
            this.f229850b = null;
        } else {
            this.f229850b = str;
        }
    }

    @Override // p204p.ny8
    /* JADX INFO: renamed from: a */
    public final String mo25750a(fk60 fk60Var) {
        return fk60Var.m41881b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufo)) {
            return false;
        }
        ufo ufoVar = (ufo) obj;
        return this.f229849a == ufoVar.f229849a && wj50.m88271j(this.f229850b, ufoVar.f229850b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f229849a) * 31;
        String str = this.f229850b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public ufo(boolean z, String str) {
        this.f229849a = z;
        this.f229850b = str;
    }
}
