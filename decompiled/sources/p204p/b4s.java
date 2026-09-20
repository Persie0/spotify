package p204p;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class b4s {

    /* JADX INFO: renamed from: a */
    public final Context f23406a;

    public b4s(Context context) {
        this.f23406a = context;
    }

    /* JADX INFO: renamed from: a */
    public final lh10 m28101a(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        ih10 ih10VarM31832a0 = c95.m31832a0(this.f23406a, str, str2);
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.f102113a = str3;
        ih10VarM31832a0.f102115c = onClickListener;
        ih10VarM31832a0.f102114b = str4;
        ih10VarM31832a0.f102116d = onClickListener2;
        return ih10VarM31832a0.m50574b();
    }

    /* JADX INFO: renamed from: b */
    public final lh10 m28102b(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
        Context context = this.f23406a;
        String string = context.getString(R.string.download_audio_only_title);
        String string2 = context.getString(R.string.download_audio_only_message);
        String string3 = context.getString(R.string.download_over_cellular_positive_settings_text);
        String string4 = context.getString(R.string.download_audio_only_negative);
        ih10 ih10VarM31832a0 = c95.m31832a0(context, string, string2);
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.f102113a = string3;
        ih10VarM31832a0.f102115c = onClickListener;
        ih10VarM31832a0.f102114b = string4;
        ih10VarM31832a0.f102116d = onClickListener2;
        ih10VarM31832a0.f102119g = onDismissListener;
        return ih10VarM31832a0.m50574b();
    }
}
