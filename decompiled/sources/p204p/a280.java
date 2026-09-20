package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a280 {

    /* JADX INFO: renamed from: a */
    public final m600 f11593a;

    /* JADX INFO: renamed from: b */
    public final String f11594b;

    /* JADX INFO: renamed from: c */
    public final m761 f11595c;

    public a280(m600 m600Var, String str, m761 m761Var) {
        this.f11593a = m600Var;
        this.f11594b = str;
        this.f11595c = m761Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m24504a(fbk fbkVar) {
        z180 z180Var;
        a22 x12Var;
        if (fbkVar instanceof z180) {
            z180Var = (z180) fbkVar;
            int i = z180Var.f278257c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z180Var.f278257c = i - Integer.MIN_VALUE;
            } else {
                z180Var = new z180(this, fbkVar);
            }
        } else {
            z180Var = new z180(this, fbkVar);
        }
        Object obj = z180Var.f278255a;
        int i2 = z180Var.f278257c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        int[] iArr = y180.f268204a;
        m761 m761Var = this.f11595c;
        int i3 = iArr[m761Var.ordinal()];
        String str = this.f11594b;
        if (i3 == 1) {
            x12Var = new z12(str, m761Var, 8);
        } else {
            Set set = dd41.f47702f;
            x12Var = r46.m74726U(str).f47709c == gn80.SHOW_EPISODE ? new x12(str, m761.PODCAST_SCROLL_NPV, 8) : new y12(str);
        }
        Observable observableM60906G = this.f11593a.m60906G(x12Var);
        z180Var.f278257c = 1;
        Object objM96571q = zn91.m96571q(observableM60906G, 1, null, z180Var);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }
}
