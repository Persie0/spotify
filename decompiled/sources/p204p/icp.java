package p204p;

/* JADX INFO: loaded from: classes.dex */
public class icp {

    /* JADX INFO: renamed from: a */
    public boolean f100855a;

    /* JADX INFO: renamed from: b */
    public mb61 f100856b;

    /* JADX INFO: renamed from: c */
    public Object f100857c;

    /* JADX INFO: renamed from: d */
    public mb61 f100858d = new hcp(5, null);

    /* JADX INFO: renamed from: e */
    public n95 f100859e;

    public icp() {
        int i = 6;
        this.f100856b = new ww0(i);
        this.f100857c = new us4(i);
    }

    /* JADX INFO: renamed from: a */
    public d7y0 mo50256a() {
        return this.f100859e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m50257b(vh00 vh00Var) {
        this.f100856b = (mb61) vh00Var;
        this.f100855a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m50258c(gh00 gh00Var, th00 th00Var) {
        n95 n95Var = new n95();
        n95Var.f151717a = (qe70) gh00Var;
        n95Var.f151718b = (qe70) th00Var;
        mo50259d(n95Var);
    }

    /* JADX INFO: renamed from: d */
    public void mo50259d(n95 n95Var) {
        this.f100859e = n95Var;
    }
}
