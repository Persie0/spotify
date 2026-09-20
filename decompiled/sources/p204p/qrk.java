package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class qrk extends gba {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f191876a;

    /* JADX INFO: renamed from: b */
    public final wg61 f191877b = new wg61(new yfk(this, 4));

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rrk f191878c;

    public qrk(rrk rrkVar, ViewGroup viewGroup) {
        this.f191878c = rrkVar;
        this.f191876a = viewGroup;
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: a */
    public final void mo33380a(View view, float f) {
        float f2 = 0.0f;
        rrk rrkVar = this.f191878c;
        if (f < 0.0f) {
            float height = rrkVar.getHeight() - (((f + 1.0f) * view.getHeight()) - ((Number) this.f191877b.getValue()).intValue());
            if (height >= 0.0f) {
                f2 = height;
            }
        }
        rrkVar.setTranslationY(f2);
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: b */
    public final void mo33381b(View view, int i) {
        if (i == 3 || i == 4) {
            this.f191878c.setTranslationY(0.0f);
        }
    }
}
