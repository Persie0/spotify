package p204p;

import android.content.ClipData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yps0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f275016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f275017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qoe f275018c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f275019d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f275020e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ eh00 f275021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yps0(List list, int i, qoe qoeVar, String str, int i2, eh00 eh00Var) {
        super(1);
        this.f275016a = list;
        this.f275017b = i;
        this.f275018c = qoeVar;
        this.f275019d = str;
        this.f275020e = i2;
        this.f275021f = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        iqs0 iqs0Var;
        int iIntValue = ((Number) obj).intValue();
        hqs0 hqs0Var = (hqs0) g6f.m43747t0(this.f275017b, this.f275016a);
        String str = (hqs0Var == null || (iqs0Var = (iqs0) g6f.m43747t0(iIntValue, hqs0Var.f94246a)) == null) ? null : iqs0Var.f104843a;
        if (str != null) {
            ((uy3) this.f275018c).f235125a.m86703a().setPrimaryClip(ClipData.newPlainText(this.f275019d, str));
            if (this.f275020e < 33) {
                this.f275021f.invoke();
            }
        }
        return w2a1.f247311a;
    }
}
