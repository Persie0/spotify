package p204p;

import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes9.dex */
public final class ok91 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pk91 f166309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok91(pk91 pk91Var) {
        super(0);
        this.f166309a = pk91Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = Build.VERSION.SDK_INT;
        pk91 pk91Var = this.f166309a;
        return i >= 31 ? yrd0.m94416c(pk91Var.f178417a.getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) pk91Var.f178417a.getSystemService("vibrator");
    }
}
