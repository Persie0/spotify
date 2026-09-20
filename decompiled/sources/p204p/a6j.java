package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a6j implements hc80 {

    /* JADX INFO: renamed from: a */
    public final gb80 f12808a;

    /* JADX INFO: renamed from: b */
    public final gb80 f12809b;

    /* JADX INFO: renamed from: c */
    public final oc80 f12810c = new oc80(this, true);

    /* JADX INFO: renamed from: d */
    public final ne2 f12811d;

    public a6j(gb80 gb80Var, gb80 gb80Var2) {
        this.f12808a = gb80Var;
        this.f12809b = gb80Var2;
        ne2 ne2Var = new ne2(this, 5);
        this.f12811d = ne2Var;
        gb80Var.mo31986a(ne2Var);
        gb80Var2.mo31986a(ne2Var);
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f12810c;
    }
}
