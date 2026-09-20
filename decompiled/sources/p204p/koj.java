package p204p;

import android.view.View;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class koj implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ContentPickerFragment f124803b;

    public /* synthetic */ koj(ContentPickerFragment contentPickerFragment, int i) {
        this.f124802a = i;
        this.f124803b = contentPickerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f124802a) {
            case 0:
                this.f124803b.m3102m1().m15621f(aoj.f17700a);
                break;
            default:
                this.f124803b.m3102m1().m15621f(coj.f40277a);
                break;
        }
    }
}
