package p204p;

import androidx.compose.p002ui.ModifierNodeDetachedCancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class exh0 implements jlq {

    /* JADX INFO: renamed from: L0 */
    public boolean f63766L0;

    /* JADX INFO: renamed from: X */
    public boolean f63767X;

    /* JADX INFO: renamed from: Y */
    public boolean f63768Y;

    /* JADX INFO: renamed from: Z */
    public p200 f63769Z;

    /* JADX INFO: renamed from: b */
    public c9k f63771b;

    /* JADX INFO: renamed from: c */
    public int f63772c;

    /* JADX INFO: renamed from: e */
    public exh0 f63774e;

    /* JADX INFO: renamed from: f */
    public exh0 f63775f;

    /* JADX INFO: renamed from: g */
    public fqk0 f63776g;

    /* JADX INFO: renamed from: h */
    public bnj0 f63777h;

    /* JADX INFO: renamed from: i */
    public boolean f63778i;

    /* JADX INFO: renamed from: t */
    public boolean f63779t;

    /* JADX INFO: renamed from: a */
    public exh0 f63770a = this;

    /* JADX INFO: renamed from: d */
    public int f63773d = -1;

    /* JADX INFO: renamed from: C1 */
    public void mo40257C1() {
        if (!this.f63766L0) {
            mt40.m62791c("reset() called on an unattached node");
        }
        mo25065B1();
    }

    /* JADX INFO: renamed from: D1 */
    public void mo40258D1() {
        if (!this.f63766L0) {
            mt40.m62791c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f63767X) {
            mt40.m62791c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f63767X = false;
        mo25074z1();
        this.f63768Y = true;
    }

    /* JADX INFO: renamed from: E1 */
    public void mo40259E1() {
        if (!this.f63766L0) {
            mt40.m62791c("node detached multiple times");
        }
        if (this.f63777h == null) {
            mt40.m62791c("detach invoked on a node without a coordinator");
        }
        if (!this.f63768Y) {
            mt40.m62791c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f63768Y = false;
        p200 p200Var = this.f63769Z;
        if (p200Var != null) {
            p200Var.invoke();
        }
        mo25064A1();
    }

    /* JADX INFO: renamed from: F1 */
    public void mo40260F1(exh0 exh0Var) {
        this.f63770a = exh0Var;
    }

    /* JADX INFO: renamed from: G1 */
    public void mo40261G1(bnj0 bnj0Var) {
        this.f63777h = bnj0Var;
    }

    /* JADX INFO: renamed from: v1 */
    public final xuk m40262v1() {
        c9k c9kVar = this.f63771b;
        if (c9kVar != null) {
            return c9kVar;
        }
        c9k c9kVarM56661c = kk40.m56661c(((oz3) wjg1.m88320J(this)).getCoroutineContext().mo26608y(qlg1.m73201f((tf60) ((oz3) wjg1.m88320J(this)).getCoroutineContext().mo26595B(gk40.f80712X0))));
        this.f63771b = c9kVarM56661c;
        return c9kVarM56661c;
    }

    /* JADX INFO: renamed from: w1 */
    public boolean mo32896w1() {
        return !(this instanceof vm8);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo40263x1() {
        if (this.f63766L0) {
            mt40.m62791c("node attached multiple times");
        }
        if (this.f63777h == null) {
            mt40.m62791c("attach invoked on a node without a coordinator");
        }
        this.f63766L0 = true;
        this.f63767X = true;
    }

    /* JADX INFO: renamed from: y1 */
    public void mo40264y1() {
        if (!this.f63766L0) {
            mt40.m62791c("Cannot detach a node that is not attached");
        }
        if (this.f63767X) {
            mt40.m62791c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f63768Y) {
            mt40.m62791c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f63766L0 = false;
        c9k c9kVar = this.f63771b;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, new ModifierNodeDetachedCancellationException());
            this.f63771b = null;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void mo25064A1() {
    }

    /* JADX INFO: renamed from: B1 */
    public void mo25065B1() {
    }

    /* JADX INFO: renamed from: z1 */
    public void mo25074z1() {
    }
}
