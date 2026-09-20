package p204p;

import androidx.car.app.model.BannerSection;
import androidx.car.app.model.ChipSection;
import androidx.car.app.model.CondensedSection;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.Header;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.Section;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.SpotlightSection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y9z0 {

    /* JADX INFO: renamed from: a */
    public List f270698a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Object f270699b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Header f270700c = null;

    /* JADX INFO: renamed from: d */
    public boolean f270701d = false;

    /* JADX INFO: renamed from: e */
    public boolean f270702e = false;

    /* JADX INFO: renamed from: f */
    public int f270703f = 1;

    /* JADX INFO: renamed from: a */
    public final SectionedItemTemplate m93162a() {
        if (this.f270701d && !this.f270698a.isEmpty()) {
            throw new IllegalArgumentException("A template cannot both be in a loading state and have sections added");
        }
        boolean z = false;
        for (int i = 0; i < this.f270698a.size(); i++) {
            Section section = (Section) this.f270698a.get(i);
            if (section instanceof ChipSection) {
                if (z) {
                    throw new IllegalArgumentException("Only one ChipSection is allowed in SectionedItemTemplate.");
                }
                if (i != 0) {
                    throw new IllegalArgumentException("ChipSection must be the first section in SectionedItemTemplate.");
                }
                z = true;
            } else if (!(section instanceof RowSection) && !(section instanceof GridSection) && !(section instanceof CondensedSection) && !(section instanceof SpotlightSection) && !(section instanceof BannerSection)) {
                throw new IllegalArgumentException("Only ChipSections, RowSections, GridSections, CondensedSections, SpotlightSections, and BannerSections are allowed in SectionedItemTemplate.");
            }
        }
        return new SectionedItemTemplate(this, 0);
    }
}
