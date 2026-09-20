package p204p;

import android.net.Uri;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class hzn0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PictureSelectionActivity f96984b;

    public /* synthetic */ hzn0(PictureSelectionActivity pictureSelectionActivity, int i) {
        this.f96983a = i;
        this.f96984b = pictureSelectionActivity;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f96983a) {
            case 0:
                Uri uri = (Uri) obj;
                wj50.m88279p(uri);
                PictureSelectionActivity pictureSelectionActivity = this.f96984b;
                pictureSelectionActivity.f6559q1 = uri;
                pictureSelectionActivity.m19765w0();
                break;
            default:
                PictureSelectionActivity pictureSelectionActivity2 = this.f96984b;
                pictureSelectionActivity2.setResult(0);
                pictureSelectionActivity2.finish();
                break;
        }
    }
}
