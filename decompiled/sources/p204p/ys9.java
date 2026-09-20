package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ys9 implements vr2 {

    /* JADX INFO: renamed from: a */
    public final Resources f275729a;

    public ys9(Resources resources) {
        this.f275729a = resources;
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: e */
    public final voc1 mo86265e() {
        return xoc1.f264101h6;
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: f */
    public final List mo64267f() {
        return Collections.singletonList(new imr(this.f275729a.getString(R.string.ai_disclosure_bluejay_learn_link), "https://www.spotify.com/legal/privacy-policy"));
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: h */
    public final zam0 mo86267h() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90662N1("BLUEJAY_DISCLOSURE_SHEET", "bluejay/disclosure-sheet", 226, "bluejay");
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: i */
    public final String mo64268i() {
        return this.f275729a.getString(R.string.ai_disclosure_bluejay_subtitle);
    }

    @Override // p204p.vr2
    public final String title() {
        return this.f275729a.getString(R.string.ai_disclosure_bluejay_title);
    }
}
