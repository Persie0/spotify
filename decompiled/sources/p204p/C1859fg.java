package p204p;

import android.provider.Settings;

/* JADX INFO: renamed from: p.fg */
/* JADX INFO: loaded from: classes5.dex */
public final class C1859fg extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2014jg f69126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1859fg(C2014jg c2014jg, int i) {
        super(0);
        this.f69125a = i;
        this.f69126b = c2014jg;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f69125a) {
            case 0:
                return Boolean.valueOf(Settings.Global.getFloat(this.f69126b.f111988a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
            default:
                return Boolean.valueOf(C2014jg.m53246a(this.f69126b));
        }
    }
}
