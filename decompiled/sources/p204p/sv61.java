package p204p;

import com.spotify.spotifyuserprofile.p159v0.Note;
import com.spotify.spotifyuserprofile.p159v0.Section;
import com.spotify.spotifyuserprofile.p159v0.SectionContent;
import com.spotify.spotifyuserprofile.p159v0.TasteProfilePage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class sv61 {

    /* JADX INFO: renamed from: a */
    public final gw61 f214349a;

    /* JADX INFO: renamed from: b */
    public final luu0 f214350b;

    public sv61(gw61 gw61Var, chj0 chj0Var) {
        this.f214349a = gw61Var;
        this.f214350b = chj0Var.f38029c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m79427a(ibk ibkVar) {
        rv61 rv61Var;
        if (ibkVar instanceof rv61) {
            rv61Var = (rv61) ibkVar;
            int i = rv61Var.f203013c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rv61Var.f203013c = i - Integer.MIN_VALUE;
            } else {
                rv61Var = new rv61(this, ibkVar);
            }
        } else {
            rv61Var = new rv61(this, ibkVar);
        }
        Object objM45922a = rv61Var.f203011a;
        int i2 = rv61Var.f203013c;
        if (i2 == 0) {
            bga.m29073P(objM45922a);
            rv61Var.f203013c = 1;
            objM45922a = this.f214349a.m45922a(rv61Var);
            yuk yukVar = yuk.f276404a;
            if (objM45922a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM45922a);
        }
        TasteProfilePage tasteProfilePage = (TasteProfilePage) objM45922a;
        String strM21576p = tasteProfilePage.m21576p();
        String str = strM21576p.length() == 0 ? null : strM21576p;
        ae50<Section> ae50VarM21577q = tasteProfilePage.m21577q();
        int i3 = 10;
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM21577q, 10));
        for (Section section : ae50VarM21577q) {
            wj50.m88279p(section);
            String strM21568q = section.m21568q();
            String title = section.m21569r() ? section.getTitle() : null;
            List<SectionContent> contentList = section.getContentList();
            ArrayList arrayList2 = new ArrayList();
            for (SectionContent sectionContent : contentList) {
                wj50.m88279p(sectionContent);
                ex61 ex61Var = sectionContent.m21571o() ? new ex61(sectionContent.m21570n().getTitle(), sectionContent.m21570n().getDescription(), sectionContent.m21570n().m21573o()) : null;
                if (ex61Var != null) {
                    arrayList2.add(ex61Var);
                }
            }
            ae50 ae50VarM21566o = section.m21566o();
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM21566o, i3));
            Iterator it = ae50VarM21566o.iterator();
            while (it.hasNext()) {
                Note note = (Note) it.next();
                wj50.m88279p(note);
                Iterator it2 = it;
                arrayList3.add(new rly(note.m21562q(), note.m21561o(), note.m21564s() / ((long) 1000), note.m21563r() == lir0.PROCESSING, note.m21560n() == EnumC2288qc.ACCEPTED));
                it = it2;
            }
            arrayList.add(new dx61(strM21568q, title, arrayList2, arrayList3, section.m21565n(), section.m21567p()));
            i3 = 10;
        }
        String strM21574n = tasteProfilePage.m21574n();
        String str2 = strM21574n.length() == 0 ? null : strM21574n;
        String strM21575o = tasteProfilePage.m21575o();
        return new rw61(tasteProfilePage.m21578r(), str, str2, strM21575o.length() == 0 ? null : strM21575o, arrayList);
    }
}
