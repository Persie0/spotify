package p204p;

import android.app.Activity;
import com.spotify.widgets.colorextraction.ColorNotExtractedError;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class g940 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f77670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g940(hqb hqbVar, int i) {
        super(1);
        this.f77669a = i;
        this.f77670b = hqbVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.f77669a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                hqb hqbVar = this.f77670b;
                if (hqbVar.isActive()) {
                    hqbVar.resumeWith("#".concat(Integer.toHexString(iIntValue).substring(2)));
                }
                return w2a1.f247311a;
            case 1:
                Exception exc = (Exception) obj;
                hqb hqbVar2 = this.f77670b;
                if (hqbVar2.isActive()) {
                    hqbVar2.resumeWith(new c6x0(new ColorNotExtractedError(exc)));
                }
                return w2a1.f247311a;
            case 2:
                this.f77670b.m48229z((Activity) obj, null);
                return w2a1.f247311a;
            case 3:
                kz00 kz00Var = (kz00) obj;
                if (kz00Var.equals(jz00.f117531a)) {
                    obj2 = rsb0.f202250a;
                } else {
                    if (!kz00Var.equals(iz00.f107098a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = psb0.f180806a;
                }
                this.f77670b.m48229z(obj2, vlb0.f242425R0);
                return w2a1.f247311a;
            case 4:
                this.f77670b.resumeWith(Integer.valueOf(((Number) obj).intValue()));
                return w2a1.f247311a;
            case 5:
                this.f77670b.resumeWith((Map) obj);
                return w2a1.f247311a;
            default:
                this.f77670b.resumeWith(new iq1((is31) obj));
                return w2a1.f247311a;
        }
    }
}
