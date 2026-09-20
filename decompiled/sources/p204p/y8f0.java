package p204p;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;

/* JADX INFO: loaded from: classes6.dex */
public final class y8f0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final MetadataRow f270294a;

    /* JADX INFO: renamed from: b */
    public final Flow f270295b;

    public y8f0(MetadataRow metadataRow, Flow flow) {
        this.f270294a = metadataRow;
        this.f270295b = flow;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f270294a;
    }
}
