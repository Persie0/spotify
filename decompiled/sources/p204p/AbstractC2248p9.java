package p204p;

/* JADX INFO: renamed from: p.p9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2248p9 extends xic1 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final f9y0 f175105a;

    /* JADX INFO: renamed from: b */
    public final gb80 f175106b;

    public AbstractC2248p9(h9y0 h9y0Var) {
        this.f175105a = h9y0Var.mo34135x();
        this.f175106b = h9y0Var.getLifecycle();
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: b */
    public final mic1 mo24736b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        gb80 gb80Var = this.f175106b;
        if (gb80Var == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        f9y0 f9y0Var = this.f175105a;
        wj50.m88279p(f9y0Var);
        wj50.m88279p(gb80Var);
        y8y0 y8y0VarM60590p = m2h1.m60590p(f9y0Var, gb80Var, canonicalName, null);
        mic1 mic1VarMo42754e = mo42754e(y8y0VarM60590p.f270416b);
        mic1VarMo42754e.m61847a("androidx.lifecycle.savedstate.vm.tag", y8y0VarM60590p);
        return mic1VarMo42754e;
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: c */
    public final mic1 mo28672c(Class cls, koi0 koi0Var) {
        String str = (String) koi0Var.f58545a.get(dlr0.f50329W0);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        f9y0 f9y0Var = this.f175105a;
        if (f9y0Var == null) {
            return mo42754e(gyf1.m46144j(koi0Var));
        }
        wj50.m88279p(f9y0Var);
        gb80 gb80Var = this.f175106b;
        wj50.m88279p(gb80Var);
        y8y0 y8y0VarM60590p = m2h1.m60590p(f9y0Var, gb80Var, str, null);
        mic1 mic1VarMo42754e = mo42754e(y8y0VarM60590p.f270416b);
        mic1VarMo42754e.m61847a("androidx.lifecycle.savedstate.vm.tag", y8y0VarM60590p);
        return mic1VarMo42754e;
    }

    @Override // p204p.xic1
    /* JADX INFO: renamed from: d */
    public final void mo63940d(mic1 mic1Var) {
        f9y0 f9y0Var = this.f175105a;
        if (f9y0Var != null) {
            gb80 gb80Var = this.f175106b;
            wj50.m88279p(gb80Var);
            m2h1.m60589o(mic1Var, f9y0Var, gb80Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract mic1 mo42754e(x8y0 x8y0Var);
}
