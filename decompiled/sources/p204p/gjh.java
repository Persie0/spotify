package p204p;

import android.content.Context;
import android.widget.FrameLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class gjh extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hjh f80482a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjh(hjh hjhVar, Context context) {
        super(context);
        this.f80482a = hjhVar;
        setId(R.id.content);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
        this.f80482a.setMinimumHeight(i);
    }
}
