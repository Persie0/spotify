package p204p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mwt implements gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qe70 f147881a;

    /* JADX WARN: Multi-variable type inference failed */
    public mwt(gh00 gh00Var) {
        this.f147881a = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public final void m63064a(Object obj) {
        this.f147881a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mwt) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f147881a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
