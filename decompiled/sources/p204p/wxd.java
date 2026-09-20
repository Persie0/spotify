package p204p;

import com.spotify.campfire.service.api.ChatWithParticipantsNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wxd extends ChatWithParticipantsNotFoundException {
    public wxd(List list) {
        super(s571.m77251j("Chat with participants ", g6f.m43753y0(list, ", ", null, null, null, 62), " not found"));
    }
}
