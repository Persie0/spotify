package p204p;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class t2z0 {

    /* JADX INFO: renamed from: a */
    public final Activity f216672a;

    /* JADX INFO: renamed from: b */
    public final y64 f216673b;

    /* JADX INFO: renamed from: c */
    public final fjf0 f216674c;

    public t2z0(Activity activity, y64 y64Var, fjf0 fjf0Var) {
        this.f216672a = activity;
        this.f216673b = y64Var;
        this.f216674c = fjf0Var;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m79934i(t2z0 t2z0Var, zbv zbvVar, boolean z, gtp0 gtp0Var, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return t2z0Var.m79942g(zbvVar, z, gtp0Var, z2);
    }

    /* JADX INFO: renamed from: a */
    public final void m79936a(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("  ");
        Activity activity = this.f216672a;
        tc41 tc41Var = new tc41(activity, vc41.SPOTIFYLOGO, activity.getResources().getDimensionPixelSize(R.dimen.std_12sp));
        tc41Var.setBounds(0, 0, tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
        spannableStringBuilder.setSpan(new uc41(3, tc41Var, true), 0, 1, 33);
    }

    /* JADX INFO: renamed from: b */
    public final SpannedString m79937b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) " • ");
        int length = spannableStringBuilder.length();
        Activity activity = this.f216672a;
        spannableStringBuilder.append((CharSequence) activity.getResources().getString(R.string.search_sponsorship_label));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getColor(R.color.factory_yellow_184)), length, spannableStringBuilder.length(), 33);
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m79938c(zbv zbvVar, gtp0 gtp0Var) {
        zq50 zq50Var = zbvVar.f281401f;
        if (zq50Var instanceof mb81) {
            return g6f.m43753y0(((mb81) zq50Var).f141831d, ", ", null, null, u2z0.f226203h, 30);
        }
        if (zq50Var instanceof iw2) {
            return g6f.m43753y0(((iw2) zq50Var).f106319a, ", ", null, null, u2z0.f226203h, 30);
        }
        if (zq50Var instanceof b67) {
            return ((b67) zq50Var).f23858a;
        }
        if (zq50Var instanceof rw6) {
            return ((rw6) zq50Var).f203268a;
        }
        if (zq50Var instanceof kuh) {
            return ((kuh) zq50Var).f126618d;
        }
        if (zq50Var instanceof dep0) {
            dep0 dep0Var = (dep0) zq50Var;
            return m79939d(dep0Var.f48138b, dep0Var.f48137a, gtp0Var);
        }
        if (zq50Var instanceof n87) {
            return g6f.m43753y0(((n87) zq50Var).f151375a, ", ", null, null, null, 62);
        }
        if (zq50Var instanceof s5b1) {
            return ((s5b1) zq50Var).f205768a;
        }
        if ((zq50Var instanceof aq5) || (zq50Var instanceof k38) || (zq50Var instanceof g410) || (zq50Var instanceof h6z0) || (zq50Var instanceof hmr0) || (zq50Var instanceof bs60) || (zq50Var instanceof jn7)) {
            return "";
        }
        if (zq50Var instanceof pzp0) {
            return ((pzp0) zq50Var).f183756b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m79939d(boolean z, boolean z2, gtp0 gtp0Var) {
        String str = (gtp0Var != null ? gtp0Var.f84256a : 0) == 3 ? gtp0Var.f84257b : "";
        if (!z) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (gtp0Var != null) {
            m79936a(spannableStringBuilder);
        }
        Activity activity = this.f216672a;
        if (z2) {
            spannableStringBuilder.append((CharSequence) grl0.m45524T(activity.getResources().getString(R.string.search_playlist_spotify_owner_name), activity.getResources().getString(R.string.search_playlist_personal)));
        } else {
            spannableStringBuilder.append((CharSequence) grl0.m45524T(activity.getResources().getString(R.string.search_playlist_spotify_owner_name), str));
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final String m79940e(boolean z, boolean z2) {
        boolean zM92902e0 = this.f216673b.m92902e0();
        Activity activity = this.f216672a;
        if (zM92902e0 && z2) {
            return activity.getResources().getString(R.string.subtitle_prompted_playlist);
        }
        return (this.f216674c.f70242b && z) ? activity.getResources().getString(R.string.subtitle_mats_playlist) : activity.getResources().getString(R.string.search_main_entity_subtitle_playlist);
    }

    /* JADX INFO: renamed from: f */
    public final sl71 m79941f(long j) {
        if (j == 0) {
            return null;
        }
        hvi0 hvi0Var = cks.f39079b;
        return (sl71) new uz3(2, this.f216672a.getResources()).invoke(new cks(jwg1.m54450E(j, ils.SECONDS)));
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m79942g(zbv zbvVar, boolean z, gtp0 gtp0Var, boolean z2) {
        String string;
        CharSequence charSequenceM79938c = m79938c(zbvVar, gtp0Var);
        zq50 zq50Var = zbvVar.f281401f;
        boolean z3 = zq50Var instanceof aq5;
        Activity activity = this.f216672a;
        if (z3) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_artist), charSequenceM79938c);
        }
        boolean z4 = zq50Var instanceof mb81;
        int i = R.string.search_main_entity_subtitle_music_video;
        if (z4) {
            Resources resources = activity.getResources();
            if (!z) {
                i = R.string.search_main_entity_subtitle_track;
            }
            return grl0.m45523S(resources.getString(i), charSequenceM79938c);
        }
        if (zq50Var instanceof iw2) {
            Resources resources2 = activity.getResources();
            int iM38547C = edb.m38547C(((iw2) zq50Var).f106320b);
            if (iM38547C == 2) {
                string = resources2.getString(R.string.search_main_entity_subtitle_album_single);
            } else if (iM38547C != 3) {
                string = iM38547C != 4 ? resources2.getString(R.string.search_main_entity_subtitle_album) : resources2.getString(R.string.search_main_entity_subtitle_album_ep);
            } else {
                string = resources2.getString(R.string.search_main_entity_subtitle_album_compilation);
            }
            return grl0.m45523S(string, charSequenceM79938c);
        }
        if (zq50Var instanceof dep0) {
            dep0 dep0Var = (dep0) zq50Var;
            CharSequence charSequenceM45523S = grl0.m45523S(m79940e(dep0Var.f48142f, dep0Var.f48143g), charSequenceM79938c);
            return (this.f216673b.m92920n0() && z2) ? m79937b(charSequenceM45523S) : charSequenceM45523S;
        }
        CharSequence string2 = "";
        if (zq50Var instanceof g410) {
            g410 g410Var = (g410) zq50Var;
            if (g410Var.f76314b) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                m79936a(spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) activity.getResources().getString(R.string.search_playlist_spotify_owner_name));
                string2 = new SpannedString(spannableStringBuilder);
            } else {
                int iM38547C2 = edb.m38547C(g410Var.f76313a);
                if (iM38547C2 == 0 || iM38547C2 == 1) {
                    string2 = activity.getResources().getString(R.string.search_main_entity_subtitle_genre);
                } else if (iM38547C2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return grl0.m45523S(string2, charSequenceM79938c);
        }
        if (zq50Var instanceof b67) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_audio_show), charSequenceM79938c);
        }
        if (zq50Var instanceof rw6) {
            return grl0.m45524T(activity.getResources().getString(R.string.search_main_entity_subtitle_audio_episode), ((rw6) zq50Var).f203268a);
        }
        if (zq50Var instanceof hmr0) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_profile), charSequenceM79938c);
        }
        if (zq50Var instanceof n87) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_audiobook), charSequenceM79938c);
        }
        if (zq50Var instanceof jn7) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_contributor_author), charSequenceM79938c);
        }
        if (zq50Var instanceof kuh) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_event), charSequenceM79938c);
        }
        if ((zq50Var instanceof h6z0) || (zq50Var instanceof k38)) {
            return "";
        }
        if (zq50Var instanceof s5b1) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_venue), charSequenceM79938c);
        }
        if (zq50Var instanceof bs60) {
            return grl0.m45523S(activity.getResources().getString(R.string.search_main_entity_subtitle_kallax), charSequenceM79938c);
        }
        if (!(zq50Var instanceof pzp0)) {
            throw new NoWhenBranchMatchedException();
        }
        Resources resources3 = activity.getResources();
        if (s2z0.f205130a[((pzp0) zq50Var).f183764t.ordinal()] != 1) {
            i = R.string.search_main_entity_subtitle_podcast_chapter;
        }
        return grl0.m45523S(resources3.getString(i), charSequenceM79938c);
    }

    /* JADX INFO: renamed from: h */
    public final String m79943h(zbv zbvVar, boolean z) {
        return m79934i(this, zbvVar, z, null, false, 8).toString();
    }
}
