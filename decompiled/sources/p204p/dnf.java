package p204p;

import android.content.Context;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class dnf {

    /* JADX INFO: renamed from: a */
    public final Context f50796a;

    /* JADX INFO: renamed from: b */
    public final String f50797b;

    public dnf(Context context) {
        this.f50796a = context;
        this.f50797b = context.getString(R.string.comments_no_comment_state);
    }

    /* JADX INFO: renamed from: a */
    public final String m36470a(myt mytVar) {
        int iOrdinal = mytVar.ordinal();
        Context context = this.f50796a;
        switch (iOrdinal) {
            case 0:
            case 1:
            case 2:
            case 6:
                return "";
            case 3:
                return context.getString(R.string.comments_episode_comments_disabled);
            case 4:
                return context.getString(R.string.comments_input_disabled_account_too_new);
            case 5:
                return context.getString(R.string.comments_episode_input_disabled_already_commented);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
