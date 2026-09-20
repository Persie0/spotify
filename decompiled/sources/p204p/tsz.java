package p204p;

import android.app.Activity;
import android.os.Parcelable;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class tsz implements g7z0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223460a;

    /* JADX INFO: renamed from: b */
    public final Object f223461b;

    public /* synthetic */ tsz(Object obj, int i) {
        this.f223460a = i;
        this.f223461b = obj;
    }

    @Override // p204p.g7z0
    /* JADX INFO: renamed from: a */
    public final List mo43930a(ph3 ph3Var) {
        switch (this.f223460a) {
            case 0:
                jz80 jz80Var = ph3Var.f177454b;
                Parcelable parcelable = jz80Var.f117620c;
                if (!(parcelable instanceof i6a0) || ((i6a0) parcelable).getCount() <= 0) {
                    return lau.f131415a;
                }
                gvl0 gvl0Var = jz80Var.f117618a;
                return Collections.singletonList(new lhv(gvl0Var.f84782c, gvl0Var.f84781b.mo85582a(), ((jiq) this.f223461b).f112811a.m51360e()));
            default:
                dw50 dw50Var = ph3Var.f177454b.f117620c;
                return (!(dw50Var instanceof aw50) || ((aw50) dw50Var).f20398b <= 0) ? lau.f131415a : Collections.singletonList(new khv(((Activity) this.f223461b).getString(R.string.your_library_recent_searches_section_header)));
        }
    }
}
