package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rsz implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final hqe1 f202455a;

    public rsz(hqe1 hqe1Var) {
        this.f202455a = hqe1Var;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return esz.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        String str = e301Var.f55571a;
        Set set = dd41.f47702f;
        String strM68854k = p1v.m68854k(intent);
        if (strM68854k == null) {
            strM68854k = "";
        }
        return new qsz(strM68854k, dd41Var.f47709c, str, intent.getStringExtra("filter"), intent.getStringExtra("parent_folder_uri"));
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        return Collections.singleton(nvp0.f158938f);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Your Library Playlist Folder Page";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return !this.f202455a.m48239J();
    }
}
