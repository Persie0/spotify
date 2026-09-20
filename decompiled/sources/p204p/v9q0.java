package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v9q0 {

    /* JADX INFO: renamed from: a */
    public static final urv0 f239022a = new urv0(Pattern.compile("spotify:prerelease:[a-zA-Z0-9]{22}"));

    /* JADX INFO: renamed from: b */
    public static final urv0 f239023b = new urv0(Pattern.compile("spotify:album:[a-zA-Z0-9]{22}"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX INFO: renamed from: a */
    public static final String m84989a(Context context, String str) {
        String string;
        if (str != null) {
            switch (str) {
                case "SINGLE":
                    string = context.getString(R.string.album_type_single);
                    break;
                case "AUDIOBOOK":
                    string = context.getString(R.string.album_type_audiobook);
                    break;
                case "EP":
                    string = context.getString(R.string.album_type_ep);
                    break;
                case "ALBUM":
                    string = context.getString(R.string.album_type_album);
                    break;
                case "COMPILATION":
                    string = context.getString(R.string.album_type_compilation);
                    break;
                case "PODCAST":
                    string = context.getString(R.string.album_type_podcast);
                    break;
                default:
                    string = context.getString(R.string.album_type_album);
                    break;
            }
        } else {
            string = context.getString(R.string.album_type_album);
        }
        wj50.m88279p(string);
        return string;
    }
}
