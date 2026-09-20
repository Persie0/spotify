package p204p;

import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class qmx0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f190427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rmx0 f190428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmx0(rmx0 rmx0Var, int i) {
        super(0);
        this.f190427a = i;
        this.f190428b = rmx0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f190427a) {
            case 0:
                wmd0 wmd0Var = this.f190428b.f200646l;
                return Boolean.valueOf(wmd0Var != null ? wmd0Var.m88557d() : false);
            default:
                wmd0 wmd0Var2 = this.f190428b.f200646l;
                boolean z = false;
                if (wmd0Var2 != null) {
                    int identifier = Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android");
                    zmd0.m96426b();
                    wmd0 wmd0Var3 = zmd0.m96427c().f143280v;
                    if (wmd0Var3 == null) {
                        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                    }
                    if (wmd0Var3 == wmd0Var2 && TextUtils.equals(Resources.getSystem().getText(identifier), wmd0Var2.f252813d)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
