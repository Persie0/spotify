package p204p;

import android.content.Context;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class i6z {

    /* JADX INFO: renamed from: a */
    public final Context f99383a;

    public i6z(Context context) {
        this.f99383a = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m49823a(vhj vhjVar) {
        boolean z = vhjVar instanceof e980;
        Context context = this.f99383a;
        if (z) {
            return context.getString(R.string.your_library_content_filter_playlists_content_description);
        }
        if (vhjVar instanceof l880) {
            return context.getString(R.string.your_library_content_filter_artists_content_description);
        }
        if (vhjVar instanceof f880) {
            return context.getString(R.string.your_library_content_filter_albums_content_description);
        }
        if (vhjVar instanceof n880) {
            return context.getString(R.string.your_library_content_filter_books_content_description);
        }
        if (vhjVar instanceof f980) {
            return context.getString(R.string.your_library_content_filter_podcasts_content_description);
        }
        if (vhjVar instanceof x880) {
            return context.getString(R.string.your_library_content_filter_downloads_content_description);
        }
        if (vhjVar instanceof i880) {
            return context.getString(R.string.your_library_content_filter_downloads_content_description);
        }
        if (vhjVar instanceof hs61) {
            String str = ((hs61) vhjVar).f94622b;
            return context.getString(R.string.your_library_tag_filter_content_description, str, str);
        }
        if (vhjVar.equals(r880.f196735b)) {
            return context.getString(R.string.your_library_content_filter_albums_content_description);
        }
        if (vhjVar.equals(s880.f206600b)) {
            return context.getString(R.string.your_library_content_filter_artists_content_description);
        }
        if (vhjVar.equals(v880.f238430b)) {
            return context.getString(R.string.your_library_content_filter_playlists_content_description);
        }
        if (vhjVar.equals(w880.f248883b)) {
            return context.getString(R.string.your_library_content_filter_podcasts_content_description);
        }
        if (vhjVar.equals(t880.f218004b)) {
            return context.getString(R.string.your_library_content_filter_books_content_description);
        }
        if (vhjVar.equals(h880.f88652b)) {
            return context.getString(R.string.your_library_content_filter_by_you_content_description);
        }
        if (vhjVar.equals(p880.f174896b)) {
            return context.getString(R.string.your_library_content_filter_by_you_content_description);
        }
        if (vhjVar.equals(g880.f77435b)) {
            return context.getString(R.string.your_library_content_filter_by_spotify_content_description);
        }
        if (vhjVar.equals(o880.f162732b)) {
            return context.getString(R.string.your_library_content_filter_by_spotify_content_description);
        }
        if (vhjVar instanceof y880) {
            return context.getString(R.string.your_library_content_filter_events_content_description);
        }
        if (vhjVar.equals(h980.f88893b)) {
            return context.getString(R.string.your_library_content_filter_upcoming_content_description);
        }
        if (vhjVar.equals(j980.f110118b)) {
            return context.getString(R.string.your_library_content_filter_venue_content_description);
        }
        if (vhjVar.equals(d980.f46745b)) {
            return context.getString(R.string.your_library_content_filter_past_content_description);
        }
        if (vhjVar.equals(m880.f140941b)) {
            return context.getString(R.string.your_library_content_filter_authors_content_description);
        }
        if (vhjVar.equals(g980.f77703b)) {
            return context.getString(R.string.your_library_content_filter_not_started_content_description);
        }
        if (vhjVar.equals(b980.f24800b)) {
            return context.getString(R.string.your_library_content_filter_in_progress_content_description);
        }
        if (vhjVar instanceof z880) {
            return context.getString(R.string.your_library_content_filter_finished_content_description);
        }
        if ((vhjVar instanceof q880) || (vhjVar instanceof u880)) {
            return context.getString(R.string.your_library_content_filter_courses_content_description);
        }
        if (vhjVar.equals(k880.f120269b) || vhjVar.equals(c980.f35422b)) {
            return context.getString(R.string.your_library_content_filter_mixed_content_description);
        }
        if (vhjVar.equals(j880.f109864b) || vhjVar.equals(a980.f13517b)) {
            return context.getString(R.string.your_library_content_filter_folders_content_description);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final String m49824b(vhj vhjVar) {
        boolean z = vhjVar instanceof e980;
        Context context = this.f99383a;
        if (z) {
            return context.getString(R.string.your_library_content_filter_playlists);
        }
        if (vhjVar instanceof l880) {
            return context.getString(R.string.your_library_content_filter_artists);
        }
        if (vhjVar instanceof f880) {
            return context.getString(R.string.your_library_content_filter_albums);
        }
        if (vhjVar instanceof f980) {
            return context.getString(R.string.your_library_content_filter_podcasts);
        }
        if (vhjVar instanceof x880) {
            return context.getString(R.string.your_library_content_filter_downloads);
        }
        if (vhjVar instanceof i880) {
            return context.getString(R.string.your_library_content_filter_downloads);
        }
        if (vhjVar instanceof n880) {
            return context.getString(R.string.your_library_content_filter_books);
        }
        if (vhjVar instanceof hs61) {
            return ((hs61) vhjVar).f94622b;
        }
        if (vhjVar.equals(r880.f196735b)) {
            return context.getString(R.string.your_library_content_filter_albums);
        }
        if (vhjVar.equals(s880.f206600b)) {
            return context.getString(R.string.your_library_content_filter_artists);
        }
        if (vhjVar.equals(v880.f238430b)) {
            return context.getString(R.string.your_library_content_filter_playlists);
        }
        if (vhjVar.equals(w880.f248883b)) {
            return context.getString(R.string.your_library_content_filter_podcasts);
        }
        if (vhjVar.equals(t880.f218004b)) {
            return context.getString(R.string.your_library_content_filter_books);
        }
        if (vhjVar.equals(h880.f88652b)) {
            return context.getString(R.string.your_library_content_filter_by_you);
        }
        if (vhjVar.equals(p880.f174896b)) {
            return context.getString(R.string.your_library_content_filter_by_you);
        }
        if (vhjVar.equals(g880.f77435b)) {
            return context.getString(R.string.your_library_content_filter_by_spotify);
        }
        if (vhjVar.equals(o880.f162732b)) {
            return context.getString(R.string.your_library_content_filter_by_spotify);
        }
        if (vhjVar instanceof y880) {
            return context.getString(R.string.your_library_content_filter_events);
        }
        if (vhjVar.equals(h980.f88893b)) {
            return context.getString(R.string.your_library_content_filter_upcoming);
        }
        if (vhjVar.equals(j980.f110118b)) {
            return context.getString(R.string.your_library_content_filter_venue);
        }
        if (vhjVar.equals(d980.f46745b)) {
            return context.getString(R.string.your_library_content_filter_past);
        }
        if (vhjVar.equals(g980.f77703b)) {
            return context.getString(R.string.your_library_content_filter_not_started);
        }
        if (vhjVar.equals(b980.f24800b)) {
            return context.getString(R.string.your_library_content_filter_in_progress);
        }
        if (vhjVar.equals(m880.f140941b)) {
            return context.getString(R.string.your_library_content_filter_authors);
        }
        if (vhjVar instanceof z880) {
            return context.getString(R.string.your_library_content_filter_finished);
        }
        if ((vhjVar instanceof q880) || (vhjVar instanceof u880)) {
            return context.getString(R.string.your_library_content_filter_courses);
        }
        if (vhjVar.equals(k880.f120269b) || vhjVar.equals(c980.f35422b)) {
            return context.getString(R.string.your_library_content_filter_mixed);
        }
        if (vhjVar.equals(j880.f109864b) || vhjVar.equals(a980.f13517b)) {
            return context.getString(R.string.your_library_content_filter_folders);
        }
        throw new NoWhenBranchMatchedException();
    }
}
