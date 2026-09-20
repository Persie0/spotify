package p204p;

import android.text.TextUtils;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final enum yk30 extends il30 {
    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public final int mo25406k(fk30 fk30Var) {
        fk30Var.getClass();
        if (TextUtils.isEmpty(fk30Var.text().title()) && TextUtils.isEmpty(fk30Var.text().subtitle())) {
            al30 al30Var = hl30.f92600b;
            return R.id.hub_glue2_regular_card_large_no_text;
        }
        al30 al30Var2 = hl30.f92600b;
        return R.id.hub_glue2_regular_card_large_description_only;
    }
}
