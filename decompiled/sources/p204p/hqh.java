package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hqh extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iqh f94183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqh(iqh iqhVar, int i) {
        super(1);
        this.f94182a = i;
        this.f94183b = iqhVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f94182a) {
            case 0:
                return new ro20(2, 1006, this.f94183b.f104766a.getString(R.string.composer_recommended_playlists_section_title, ((tqh) obj).f222816a), null, null, null, false);
            case 1:
                oqh oqhVar = (oqh) obj;
                Context context = this.f94183b.f104766a;
                List list = oqhVar.f168294b;
                int i = 0;
                boolean z = list.size() >= 10;
                String str = oqhVar.f168293a;
                String string = context.getString(R.string.composer_music_videos_section_title);
                String string2 = z ? context.getString(R.string.composer_section_button_show_all) : null;
                String str2 = oqhVar.f168293a;
                rzd1 rzd1Var = new rzd1(string, 210, null, string2, false, z ? "spotify:list:artist-music-videos:".concat(wl51.m88482f1(':', str2, str2)) : null);
                List listM43714b1 = g6f.m43714b1(list, 10);
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
                for (Object obj2 : listM43714b1) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    arrayList.add(new m5e0(s571.m77246e(i, "video-preview-composer-page-"), s571.m77246e(i, "video-preview-composer-page-"), str3, str3));
                    i = i2;
                }
                return new n5e0("video-preview-composer-page", "video-preview-composer-page", rzd1Var, arrayList, str, 16);
            case 2:
                Context context2 = this.f94183b.f104766a;
                return new l390(context2.getString(R.string.composer_section_button_show_all), context2.getString(R.string.composer_section_button_show_all), s571.m77250i(((qqh) obj).f191599a, ":releases"));
            case 3:
                Context context3 = this.f94183b.f104766a;
                return new ro20(2, 994, context3.getString(R.string.composer_popular_releases_section_title), null, context3.getString(R.string.composer_section_button_show_all), s571.m77250i(((rqh) obj).f201834a, ":releases"), false);
            case 4:
                uqh uqhVar = (uqh) obj;
                Context context4 = this.f94183b.f104766a;
                List list2 = uqhVar.f233018c;
                int i3 = 0;
                boolean z2 = list2.size() >= 10;
                String str4 = uqhVar.f233016a;
                String string3 = context4.getString(R.string.composer_unmapped_music_videos_section_title, uqhVar.f233017b);
                String string4 = z2 ? context4.getString(R.string.composer_section_button_show_all) : null;
                String str5 = uqhVar.f233016a;
                rzd1 rzd1Var2 = new rzd1(string3, 210, null, string4, false, z2 ? "spotify:list:artist-music-videos:unmapped-".concat(wl51.m88482f1(':', str5, str5)) : null);
                List listM43714b2 = g6f.m43714b1(list2, 10);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43714b2, 10));
                for (Object obj3 : listM43714b2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    String str6 = (String) obj3;
                    arrayList2.add(new m5e0(s571.m77246e(i3, "unmapped-video-preview-composer-page-"), s571.m77246e(i3, "unmapped-video-preview-composer-page-"), str6, str6));
                    i3 = i4;
                }
                return new n5e0("unmapped-video-preview-composer-page", "unmapped-video-preview-composer-page", rzd1Var2, arrayList2, str4, 16);
            case 5:
                Context context5 = this.f94183b.f104766a;
                return new l390(context5.getString(R.string.composer_section_button_show_all), context5.getString(R.string.composer_section_button_show_all), s571.m77250i(((wqh) obj).f254045a, ":works"));
            case 6:
                Context context6 = this.f94183b.f104766a;
                return new ro20(2, 994, context6.getString(R.string.composer_works_section_title), null, context6.getString(R.string.composer_section_button_show_all), s571.m77250i(((xqh) obj).f265051a, ":works"), false);
            case 7:
                return new ro20(2, 1006, this.f94183b.f104766a.getString(R.string.composer_fans_also_like_section_title), null, null, null, false);
            default:
                return new ro20(2, 1006, this.f94183b.f104766a.getString(R.string.composer_biography_section_title), null, null, null, false);
        }
    }
}
