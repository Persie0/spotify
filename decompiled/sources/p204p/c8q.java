package p204p;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class c8q implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s2o f35298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f35299c;

    public /* synthetic */ c8q(s2o s2oVar, boolean z, int i) {
        this.f35297a = i;
        this.f35298b = s2oVar;
        this.f35299c = z;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        int i;
        switch (this.f35297a) {
            case 0:
                String str = (String) obj;
                s2o s2oVar = this.f35298b;
                Context context = (Context) s2oVar.f205039f;
                String string = str.length() > 0 ? context.getString(R.string.aligned_curation_snackbar_added_to, str) : context.getString(R.string.aligned_curation_snackbar_changes_saved);
                wj50.m88279p(string);
                return s2oVar.m77078N(string, this.f35299c);
            case 1:
                String str2 = (String) obj;
                s2o s2oVar2 = this.f35298b;
                Context context2 = (Context) s2oVar2.f205039f;
                String string2 = str2.length() > 0 ? context2.getString(R.string.aligned_curation_snackbar_removed_from, str2) : context2.getString(R.string.aligned_curation_snackbar_changes_saved);
                wj50.m88279p(string2);
                return s2oVar2.m77078N(string2, this.f35299c);
            default:
                int iOrdinal = ((ixq0) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i = R.string.aligned_curation_snackbar_pre_save;
                } else if (iOrdinal == 2) {
                    i = R.string.aligned_curation_snackbar_pre_save_single;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.aligned_curation_snackbar_pre_save_unknown;
                }
                s2o s2oVar3 = this.f35298b;
                return s2oVar3.m77078N(((Context) s2oVar3.f205039f).getString(i), this.f35299c);
        }
    }
}
