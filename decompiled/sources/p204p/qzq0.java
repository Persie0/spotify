package p204p;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lp/qzq0;", "Lp/i500;", "<init>", "()V", "src_main_java_com_spotify_tome_dialog-dialog"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class qzq0 extends i500 {

    /* JADX INFO: renamed from: A1 */
    public khr f194253A1;

    /* JADX INFO: renamed from: B1 */
    public int f194254B1 = -1;

    @Override // p204p.i500
    /* JADX INFO: renamed from: D0 */
    public void mo26182D0(int i, int i2, Intent intent) {
        na6.m63955c(-1, Integer.valueOf(i));
        super.mo26182D0(i, i2, intent);
        khr khrVar = this.f194253A1;
        if (khrVar != null) {
            khrVar.mo26182D0(i, i2, intent);
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle != null) {
            bundle.setClassLoader(m49702X0().getClassLoader());
            String string = bundle.getString("presenter_tag");
            this.f194253A1 = string != null ? (khr) m49720s0().m31604F(string) : null;
            this.f194254B1 = bundle.getInt("request_code");
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public void mo880O0(Bundle bundle) {
        String str;
        khr khrVar = this.f194253A1;
        if (khrVar != null && (str = khrVar.f98688Y0) != null) {
            bundle.putString("presenter_tag", str);
        }
        bundle.putInt("request_code", this.f194254B1);
    }

    /* JADX INFO: renamed from: h1 */
    public void mo26183h1() {
        na6.m63955c(-1, Integer.valueOf(this.f194254B1));
    }
}
