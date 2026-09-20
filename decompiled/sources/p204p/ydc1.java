package p204p;

import android.text.TextUtils;
import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ydc1 extends s2v {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f271734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydc1(int i) {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
        this.f271734e = i;
        switch (i) {
            case 1:
                super(R.id.tag_state_description, CharSequence.class, 64, 30);
                break;
            case 2:
                super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    @Override // p204p.s2v
    /* JADX INFO: renamed from: c */
    public final Object mo77099c(View view) {
        switch (this.f271734e) {
            case 0:
                return gec1.m44464a(view);
            case 1:
                return iec1.m50373b(view);
            default:
                return Boolean.valueOf(gec1.m44465b(view));
        }
    }

    @Override // p204p.s2v
    /* JADX INFO: renamed from: d */
    public final void mo77100d(View view, Object obj) {
        switch (this.f271734e) {
            case 0:
                gec1.m44469f(view, (CharSequence) obj);
                break;
            case 1:
                iec1.m50374c(view, (CharSequence) obj);
                break;
            default:
                gec1.m44468e(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p204p.s2v
    /* JADX INFO: renamed from: n */
    public final boolean mo77109n(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f271734e) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                zEquals = s2v.m77097a((Boolean) obj, (Boolean) obj2);
                break;
        }
        return !zEquals;
    }
}
