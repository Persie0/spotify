package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final enum fm30 extends nm30 {
    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public final int mo25406k(fk30 fk30Var) {
        String strString = fk30Var.custom().string("style");
        if (kgg1.m56363z(strString)) {
            if (kgg1.m56363z(fk30Var.text().subtitle())) {
                mm30[] mm30VarArr = mm30.f145035c;
                return R.id.hub_glue2_section_header;
            }
            mm30[] mm30VarArr2 = mm30.f145035c;
            return R.id.hub_glue2_section_header_with_subtitle;
        }
        for (mm30 mm30Var : mm30.values()) {
            if (mm30Var.f145038b.equals(strString)) {
                return mm30Var.f145037a;
            }
        }
        throw new IllegalArgumentException(edb.m38564m("Unknown style: ", strString));
    }
}
