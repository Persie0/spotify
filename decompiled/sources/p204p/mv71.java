package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mv71 implements ov71 {

    /* JADX INFO: renamed from: a */
    public final ern0 f147528a;

    public mv71(ern0 ern0Var) {
        this.f147528a = ern0Var;
    }

    @Override // p204p.ov71
    /* JADX INFO: renamed from: a */
    public final r0x0 mo60071a(int i) {
        Long l = (Long) this.f147528a.get(Integer.valueOf(i));
        return l != null ? new p0x0(new pdz0(l.longValue())) : q0x0.f184130a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv71) && wj50.m88271j(this.f147528a, ((mv71) obj).f147528a);
    }

    public final int hashCode() {
        return this.f147528a.hashCode();
    }
}
