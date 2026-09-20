package p204p;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class zlc extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u12 f283975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlc(u12 u12Var, int i) {
        super(0);
        this.f283974a = i;
        this.f283975b = u12Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f283974a) {
            case 0:
                return (Group) ((View) this.f283975b.f225649c).findViewById(R.id.content_group);
            case 1:
                return (LinearLayout) ((View) this.f283975b.f225649c).findViewById(R.id.filter_error_container);
            case 2:
                return (TextView) ((View) this.f283975b.f225649c).findViewById(R.id.pronouns_limit_warning);
            default:
                return (EditText) ((View) this.f283975b.f225649c).findViewById(R.id.searchbar_input);
        }
    }
}
