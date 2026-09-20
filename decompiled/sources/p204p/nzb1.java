package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class nzb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qzb1 f160057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzb1(qzb1 qzb1Var) {
        super(0);
        this.f160057a = qzb1Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = Build.VERSION.SDK_INT;
        qzb1 qzb1Var = this.f160057a;
        Object parcelable = i >= 33 ? qzb1Var.m49701W0().getParcelable("com.spotify.adsdisplay.display.videooverlay.ad", fh0.class) : qzb1Var.m49701W0().getParcelable("com.spotify.adsdisplay.display.videooverlay.ad");
        if (parcelable != null) {
            return new tzb1((fh0) parcelable);
        }
        throw new IllegalStateException(s571.m77251j("Missing required argument 'com.spotify.adsdisplay.display.videooverlay.ad'. Did you remember to create the fragment using ", qzb1.class.getSimpleName(), ".create(...)?").toString());
    }
}
