package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.settings.localfiles.api.LocalFilesLibrarySettingsItemFactory;
import kotlin.Metadata;
import p204p.g3e;
import p204p.gn41;
import p204p.ke61;
import p204p.ne61;
import p204p.qpv0;
import p204p.ue61;
import p204p.wow0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/localfiles/settings/localfiles/impl/LocalFilesLibrarySettingsItemFactoryImpl;", "Lcom/spotify/localfiles/settings/localfiles/api/LocalFilesLibrarySettingsItemFactory;", "<init>", "()V", "Lp/gn41;", "create", "()Lp/gn41;", "src_main_java_com_spotify_localfiles_settings_localfiles_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LocalFilesLibrarySettingsItemFactoryImpl implements LocalFilesLibrarySettingsItemFactory {
    @Override // com.spotify.localfiles.settings.localfiles.api.LocalFilesLibrarySettingsItemFactory
    public gn41 create() {
        Integer numValueOf = Integer.valueOf(C0862R.string.settings_item_local_files_library_title);
        Integer numValueOf2 = Integer.valueOf(C0862R.string.settings_item_local_files_library_description);
        g3e.f76187x.getClass();
        return new gn41("localFilesLibrary", numValueOf, numValueOf2, null, null, null, null, wow0.f253579N0, null, new ue61(new ke61(28, false), new ne61(qpv0.f191387a.mo54112b(LocalFilesSettingsValueAccessor.class))), null, 22506);
    }
}
