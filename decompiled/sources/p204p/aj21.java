package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final enum aj21 extends rj21 {
    public aj21() {
        super("CARD_GRID_ROW", 10);
    }

    @Override // p204p.xj21
    /* JADX INFO: renamed from: a */
    public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Resources resources = context.getResources();
        int iM88766u = wqg1.m88766u(8.0f, resources);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(iM88766u, 0, iM88766u, 0);
        int integer = resources.getInteger(R.integer.card_row_columns);
        for (int i = 0; i < integer; i++) {
            layoutInflater.inflate(R.layout.skeleton_card, (ViewGroup) linearLayout, true);
        }
        return linearLayout;
    }
}
