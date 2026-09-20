package p204p;

import android.util.TypedValue;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class sjc1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tjc1 f209807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sjc1(tjc1 tjc1Var, int i) {
        super(0);
        this.f209806a = i;
        this.f209807b = tjc1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f209806a) {
            case 0:
                TypedValue typedValue = new TypedValue();
                this.f209807b.f220886a.getTheme().resolveAttribute(R.attr.textBase, typedValue, true);
                return Integer.valueOf(typedValue.data);
            default:
                TypedValue typedValue2 = new TypedValue();
                this.f209807b.f220886a.getTheme().resolveAttribute(R.attr.textSubdued, typedValue2, true);
                return Integer.valueOf(typedValue2.data);
        }
    }
}
