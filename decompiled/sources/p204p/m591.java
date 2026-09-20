package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class m591 extends f1c {

    /* JADX INFO: renamed from: c */
    public final o591 f140169c;

    /* JADX INFO: renamed from: d */
    public q591 f140170d;

    public m591(float f, float f2, o591 o591Var) {
        super(f, f2);
        this.f140169c = o591Var;
        q591 q591Var = new q591();
        q591Var.f185485b = new ArrayList();
        this.f140170d = q591Var;
        q591Var.f185484a = 1;
    }

    /* JADX INFO: renamed from: c */
    public final n591 m60850c(float f) {
        c4b1 c4b1Var = new c4b1(this.f64853a, this.f64854b, f);
        this.f140170d.f185485b.add(c4b1Var);
        this.f64853a = 1.0f;
        this.f64854b = f;
        q591 q591Var = this.f140170d;
        n591 n591Var = new n591(1.0f, f, this.f140169c);
        n591Var.f140170d = q591Var;
        n591Var.f150508f = this;
        n591Var.f150507e = c4b1Var;
        return n591Var;
    }
}
