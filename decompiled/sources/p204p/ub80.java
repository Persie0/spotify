package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ub80 implements zb80, xuk {

    /* JADX INFO: renamed from: a */
    public final gb80 f228653a;

    /* JADX INFO: renamed from: b */
    public final juk f228654b;

    public ub80(gb80 gb80Var, juk jukVar) {
        this.f228653a = gb80Var;
        this.f228654b = jukVar;
        if (gb80Var.mo31987b() == fb80.f67750a) {
            qlg1.m73212q(jukVar);
        }
    }

    @Override // p204p.xuk
    /* JADX INFO: renamed from: M */
    public final juk mo31960M() {
        return this.f228654b;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        gb80 gb80Var = this.f228653a;
        if (gb80Var.mo31987b().compareTo(fb80.f67750a) <= 0) {
            gb80Var.mo31988d(this);
            qlg1.m73212q(this.f228654b);
        }
    }
}
