package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.localfiles.mediastore.MediaStoreReaderOptions;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import com.spotify.localfiles.mediastoreimpl.C0856x402959e7;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties;
import p204p.bji;
import p204p.jg31;

/* JADX INFO: loaded from: classes2.dex */
final class DaggerLocalFilesServiceFactoryComponent {

    public static final class Factory implements LocalFilesServiceFactoryComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.spotify.localfiles.localfilescore.LocalFilesServiceFactoryComponent.Factory
        public LocalFilesServiceFactoryComponent create(LocalFilesServiceDependencies localFilesServiceDependencies) {
            jg31.m53268f(localFilesServiceDependencies);
            return new LocalFilesServiceFactoryComponentImpl(localFilesServiceDependencies);
        }

        private Factory() {
        }
    }

    public static final class LocalFilesServiceFactoryComponentImpl implements LocalFilesServiceFactoryComponent {
        private final LocalFilesServiceDependencies localFilesServiceDependencies;
        private final LocalFilesServiceFactoryComponentImpl localFilesServiceFactoryComponentImpl = this;

        public LocalFilesServiceFactoryComponentImpl(LocalFilesServiceDependencies localFilesServiceDependencies) {
            this.localFilesServiceDependencies = localFilesServiceDependencies;
        }

        public LocalFilesProperties localFilesProperties() {
            bji configurationProvider = this.localFilesServiceDependencies.getConfigurationProvider();
            jg31.m53271i(configurationProvider);
            return new LocalFilesProperties(configurationProvider);
        }

        @Override // com.spotify.localfiles.localfilescore.LocalFilesServiceFactoryComponent
        public LocalFilesService localFilesService() {
            Context context = this.localFilesServiceDependencies.getContext();
            jg31.m53271i(context);
            MediaStoreReaderOptions mediaStoreReaderOptions = mediaStoreReaderOptions();
            OpenedAudioFiles openedAudioFiles = this.localFilesServiceDependencies.getOpenedAudioFiles();
            jg31.m53271i(openedAudioFiles);
            return new LocalFilesService(context, mediaStoreReaderOptions, openedAudioFiles);
        }

        public MediaStoreReaderOptions mediaStoreReaderOptions() {
            return C0856x402959e7.provideMediaStoreReaderOptions(localFilesProperties());
        }
    }

    private DaggerLocalFilesServiceFactoryComponent() {
    }

    public static LocalFilesServiceFactoryComponent.Factory factory() {
        return new Factory(0);
    }
}
