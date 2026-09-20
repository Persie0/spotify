package p204p;

import com.spotify.encoreconsumermobile.elements.entitymetadata.EntityMetadataView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ndv extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q6u f152847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndv(q6u q6uVar, int i) {
        super(0);
        this.f152846a = i;
        this.f152847b = q6uVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f152846a) {
            case 0:
                return (EncoreTextView) ((mdv) this.f152847b.f185925b).findViewById(R.id.body_text);
            default:
                return (EntityMetadataView) ((mdv) this.f152847b.f185925b).findViewById(R.id.entity_metadata);
        }
    }
}
