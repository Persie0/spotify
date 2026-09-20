package p204p;

import android.os.Build;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class njs0 implements b800 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ojs0 f154654b;

    public /* synthetic */ njs0(ojs0 ojs0Var, int i) {
        this.f154653a = i;
        this.f154654b = ojs0Var;
    }

    @Override // p204p.b800
    /* JADX INFO: renamed from: b */
    public final void mo27561b(String str, Bundle bundle) {
        Object serializable;
        Object serializable2;
        Object serializable3;
        switch (this.f154653a) {
            case 0:
                hz0 hz0Var = this.f154654b.f166124e;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("more_option_selected_key", vzh0.class);
                    if (serializable == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    Object serializable4 = bundle.getSerializable("more_option_selected_key");
                    if (serializable4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.spotify.aiplaylist.moreoptionsmenuimpl.MoreOptions");
                    }
                    serializable = (vzh0) serializable4;
                }
                vzh0 vzh0Var = (vzh0) serializable;
                if (vzh0Var instanceof uzh0) {
                    hz0Var.accept(new ahs0(((uzh0) vzh0Var).f235588a));
                    return;
                } else {
                    if (!(vzh0Var instanceof tzh0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hz0Var.accept(xfs0.f261092a);
                    return;
                }
            case 1:
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable2 = bundle.getSerializable("create_playlist_failure_fragment_result_key", wal.class);
                    if (serializable2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    Object serializable5 = bundle.getSerializable("create_playlist_failure_fragment_result_key");
                    if (serializable5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.spotify.aiplaylist.promptcreation.presentation.tracklist.CreatePlaylistFailureAlertFragment.Result");
                    }
                    serializable2 = (wal) serializable5;
                }
                if (ijs0.f102890a[((wal) serializable2).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f154654b.f166124e.accept(new bgs0(null));
                return;
            default:
                hz0 hz0Var2 = this.f154654b.f166124e;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable3 = bundle.getSerializable("edit_option_selected_key", ius.class);
                    if (serializable3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    Object serializable6 = bundle.getSerializable("edit_option_selected_key");
                    if (serializable6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.spotify.aiplaylist.editoptionsmenuimpl.EditOptions");
                    }
                    serializable3 = (ius) serializable6;
                }
                ius iusVar = (ius) serializable3;
                if (iusVar instanceof gus) {
                    hz0Var2.accept(new zgs0(((gus) iusVar).f84537a));
                    return;
                } else {
                    if (!(iusVar instanceof hus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hz0Var2.accept(new bgs0(((hus) iusVar).f95453a));
                    return;
                }
        }
    }
}
