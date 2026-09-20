package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zvc implements vr2 {

    /* JADX INFO: renamed from: a */
    public final Resources f286682a;

    public zvc(Resources resources) {
        this.f286682a = resources;
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: f */
    public final List mo64267f() {
        return Collections.singletonList(new imr(this.f286682a.getString(R.string.ai_disclosure_chat_ai_link), "https://www.spotify.com/legal/privacy-policy"));
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: g */
    public final String mo86266g() {
        return this.f286682a.getString(R.string.ai_disclosure_chat_ai_confirm);
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: i */
    public final String mo64268i() {
        return this.f286682a.getString(R.string.ai_disclosure_chat_ai_subtitle);
    }

    @Override // p204p.vr2
    public final String title() {
        return this.f286682a.getString(R.string.ai_disclosure_chat_ai_title);
    }
}
