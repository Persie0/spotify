package p204p;

import android.icu.text.DateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class mcq0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x1p0 f142235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mcq0(x1p0 x1p0Var, int i) {
        super(0);
        this.f142234a = i;
        this.f142235b = x1p0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f142234a) {
            case 0:
                return DateFormat.getPatternInstance("MMMMd", (Locale) ((wg61) this.f142235b.f257248c).getValue());
            case 1:
                return DateFormat.getPatternInstance("MMMd", (Locale) ((wg61) this.f142235b.f257248c).getValue());
            default:
                return DateFormat.getPatternInstance("yMMMd", (Locale) ((wg61) this.f142235b.f257248c).getValue());
        }
    }
}
