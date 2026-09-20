package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class utg1 extends lqf {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f233920f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ fug1 f233921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utg1(fug1 fug1Var, int i) {
        super(fug1Var);
        this.f233920f = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(fug1Var);
                this.f233921g = fug1Var;
                super(fug1Var);
                break;
            case 2:
                Objects.requireNonNull(fug1Var);
                this.f233921g = fug1Var;
                super(fug1Var);
                break;
            default:
                Objects.requireNonNull(fug1Var);
                this.f233921g = fug1Var;
                break;
        }
    }

    @Override // p204p.lqf
    /* JADX INFO: renamed from: b */
    public final Object mo41666b(int i) {
        switch (this.f233920f) {
            case 0:
                return this.f233921g.m42729a()[i];
            case 1:
                return new cug1(this.f233921g, i);
            default:
                return this.f233921g.m42730b()[i];
        }
    }
}
