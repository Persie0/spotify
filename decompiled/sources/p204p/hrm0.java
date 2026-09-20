package p204p;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes9.dex */
public final class hrm0 implements UnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hc50 f94487b;

    public /* synthetic */ hrm0(hc50 hc50Var, int i) {
        this.f94486a = i;
        this.f94487b = hc50Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f94486a) {
            case 0:
                y4l0 y4l0Var = (y4l0) obj;
                y4l0Var.f269174c.add(this.f94487b);
                return y4l0Var;
            default:
                y4l0 y4l0Var2 = (y4l0) obj;
                y4l0Var2.f269174c.add(this.f94487b);
                return y4l0Var2;
        }
    }
}
